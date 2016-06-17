

package org.netbeans.jfluidon.component.save.ui;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;

/**
 *
 * @author Gaurav Gupta
 */
public class SaveNotifier 
{
    private static  SaveNotifier instance = null;
    public final static Object SAVE_ALWAYS_OPTION = new Integer(9999);
    
    public static SaveNotifier getDefault()
    {
        if (instance == null)
            instance = new SaveNotifier();
        
        return instance;
    }
    
    /**
     * Creates a new instance of SaveNotifier
     */
    private SaveNotifier() 
    {
    }
    
    public Object displayNotifier(
            String dialogTitle, String saveType, String saveName) 
    {
        DialogManager dmgr = new DialogManager(dialogTitle, saveType, saveName);
        dmgr.prompt();
        
        return dmgr.getResult();
    }
    
    
    private static class DialogManager implements ActionListener 
    {
        private DialogDescriptor dialogDesc = null;
        private Dialog dialog = null;
        private Object result = DialogDescriptor.CANCEL_OPTION;

        private final Object[] closeOptions =
        {
            DialogDescriptor.DEFAULT_OPTION,
            DialogDescriptor.DEFAULT_OPTION,
            DialogDescriptor.YES_OPTION
        };
        
        public DialogManager(
            String dialogTitle, String saveType, String saveName) 
        {
            
            JButton saveAlwaysButton = new JButton(NbBundle.getMessage(
                SaveNotifier.class, "LBL_SaveAlwaysButton")); // NOI18N
            saveAlwaysButton.setActionCommand(NbBundle.getMessage(
                    SaveNotifier.class, "LBL_SaveAlwaysButton")); // NOI18N
            saveAlwaysButton.getAccessibleContext().setAccessibleDescription(
                    NbBundle.getMessage(
                        SaveNotifier.class, "ACSD_SaveAlwaysButton")); // NOI18N
            Mnemonics.setLocalizedText(
                    saveAlwaysButton, NbBundle.getMessage(
                        SaveNotifier.class, "LBL_SaveAlwaysButton")); // NOI18N

            Object[] buttonOptions =
            {
                DialogDescriptor.OK_OPTION,
                DialogDescriptor.CANCEL_OPTION,
                saveAlwaysButton
            };
            
            dialogDesc = new DialogDescriptor(
                NbBundle.getMessage(SaveNotifier.class, 
                    "LBL_SaveNotifierDialog_Question", saveType, saveName), // NOI18N
                dialogTitle, // title
                true, // modal?
                buttonOptions,
                DialogDescriptor.OK_OPTION, // default option
                DialogDescriptor.DEFAULT_ALIGN,
                null, // help context
                this, // button action listener
                false); // leaf?
            
            dialogDesc.setClosingOptions(closeOptions);
            dialog = DialogDisplayer.getDefault().createDialog(dialogDesc);
        }
        
        private void prompt() 
        {
            dialog.setVisible(true);
        }
        
        public void actionPerformed(ActionEvent actionEvent) 
        {
            if (actionEvent.getActionCommand().equalsIgnoreCase(
                    NbBundle.getMessage(SaveNotifier.class, "LBL_OKButton"))) // NOI18N
            {
                result = DialogDescriptor.OK_OPTION;
            }
            
            else if (actionEvent.getActionCommand().equalsIgnoreCase(
                    NbBundle.getMessage(
                        SaveNotifier.class, "LBL_SaveAlwaysButton"))) // NOI18N))
            {
                result = SAVE_ALWAYS_OPTION;
            }
            
            else // Cancel or 'x' box close
                result = DialogDescriptor.CANCEL_OPTION;
            
            dialog.setVisible(false);
            dialog.dispose();
        }
        
        public Object getResult() 
        {
            return result;
        }
    }
    
}
