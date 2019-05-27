package com.fangxuele.tool.push.ui.form;

import com.fangxuele.tool.push.App;
import com.fangxuele.tool.push.logic.MessageTypeEnum;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 * MessageTypeForm
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2019/5/7.
 */
@Getter
public class MessageTypeForm {
    private JPanel messageTypePanel;
    private JRadioButton mpTemplateRadioButton;
    private JRadioButton maTemplateRadioButton;
    private JRadioButton kefuRadioButton;
    private JRadioButton kefuPriorityRadioButton;
    private JRadioButton aliYunRadioButton;
    private JRadioButton aliTemplateRadioButton;
    private JRadioButton txYunRadioButton;
    private JRadioButton yunPianRadioButton;
    private JRadioButton upYunRadioButton;
    private JRadioButton hwYunRadioButton;
    private JRadioButton eMailRadioButton;
    private JPanel panel2;
    private JRadioButton 网易云信短信RadioButton;
    private JRadioButton 榛子云短信RadioButton;
    private JRadioButton luosimao短信RadioButton;
    private JRadioButton 极光短信RadioButton;
    private JRadioButton 极光推送RadioButton;
    private JRadioButton 企业号企业微信RadioButton;
    private JRadioButton 钉钉RadioButton;

    public static MessageTypeForm messageTypeForm = new MessageTypeForm();

    /**
     * 初始化消息类型tab
     */
    public static void init() {
        int msgType = App.config.getMsgType();
        clearAllSelected();

        switch (msgType) {
            case MessageTypeEnum.MP_TEMPLATE_CODE:
                messageTypeForm.getMpTemplateRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.MA_TEMPLATE_CODE:
                messageTypeForm.getMaTemplateRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.KEFU_CODE:
                messageTypeForm.getKefuRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.KEFU_PRIORITY_CODE:
                messageTypeForm.getKefuPriorityRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.ALI_YUN_CODE:
                messageTypeForm.getAliYunRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.ALI_TEMPLATE_CODE:
                messageTypeForm.getAliTemplateRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.TX_YUN_CODE:
                messageTypeForm.getTxYunRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.YUN_PIAN_CODE:
                messageTypeForm.getYunPianRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.UP_YUN_CODE:
                messageTypeForm.getUpYunRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.HW_YUN_CODE:
                messageTypeForm.getHwYunRadioButton().setSelected(true);
                break;
            case MessageTypeEnum.EMAIL_CODE:
                messageTypeForm.getEMailRadioButton().setSelected(true);
                break;

            default:
        }
        if (msgType == MessageTypeEnum.MP_TEMPLATE_CODE || msgType == MessageTypeEnum.MA_TEMPLATE_CODE
                || msgType == MessageTypeEnum.KEFU_CODE || msgType == MessageTypeEnum.KEFU_PRIORITY_CODE) {
            MemberForm.memberForm.getImportFromWeixinPanel().setVisible(true);
            MemberForm.memberForm.getImportOptionPanel().setVisible(true);
        } else {
            MemberForm.memberForm.getImportFromWeixinPanel().setVisible(false);
            MemberForm.memberForm.getImportOptionPanel().setVisible(false);
        }
        MessageEditForm.switchMsgType(msgType);
        MessageManageForm.init();
        MessageEditForm.clearAllField();
        MemberForm.init();
        PushHisForm.init();
    }

    /**
     * 清除所有radio选中状态
     */
    public static void clearAllSelected() {
        messageTypeForm.getMpTemplateRadioButton().setSelected(false);
        messageTypeForm.getMaTemplateRadioButton().setSelected(false);
        messageTypeForm.getKefuRadioButton().setSelected(false);
        messageTypeForm.getKefuPriorityRadioButton().setSelected(false);
        messageTypeForm.getAliYunRadioButton().setSelected(false);
        messageTypeForm.getAliTemplateRadioButton().setSelected(false);
        messageTypeForm.getTxYunRadioButton().setSelected(false);
        messageTypeForm.getYunPianRadioButton().setSelected(false);
        messageTypeForm.getUpYunRadioButton().setSelected(false);
        messageTypeForm.getHwYunRadioButton().setSelected(false);
        messageTypeForm.getEMailRadioButton().setSelected(false);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        messageTypePanel = new JPanel();
        messageTypePanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        messageTypePanel.setAutoscrolls(false);
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setAutoscrolls(true);
        messageTypePanel.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(18, 2, new Insets(20, 20, 0, 0), -1, -1));
        panel2.setAutoscrolls(true);
        scrollPane1.setViewportView(panel2);
        mpTemplateRadioButton = new JRadioButton();
        mpTemplateRadioButton.setEnabled(true);
        mpTemplateRadioButton.setText("公众号-模板消息");
        panel2.add(mpTemplateRadioButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel2.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        maTemplateRadioButton = new JRadioButton();
        maTemplateRadioButton.setText("小程序-模板消息");
        panel2.add(maTemplateRadioButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        kefuRadioButton = new JRadioButton();
        kefuRadioButton.setText("公众号-客服消息");
        panel2.add(kefuRadioButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        kefuPriorityRadioButton = new JRadioButton();
        kefuPriorityRadioButton.setText("公众号-客服消息优先");
        kefuPriorityRadioButton.setToolTipText("优先尝试发送客服消息，如果失败则发送模板消息");
        panel2.add(kefuPriorityRadioButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        aliYunRadioButton = new JRadioButton();
        aliYunRadioButton.setText("阿里云短信");
        panel2.add(aliYunRadioButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        aliTemplateRadioButton = new JRadioButton();
        aliTemplateRadioButton.setText("阿里大于模板短信");
        panel2.add(aliTemplateRadioButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        txYunRadioButton = new JRadioButton();
        txYunRadioButton.setText("腾讯云短信");
        panel2.add(txYunRadioButton, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yunPianRadioButton = new JRadioButton();
        yunPianRadioButton.setText("云片网短信");
        panel2.add(yunPianRadioButton, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        upYunRadioButton = new JRadioButton();
        upYunRadioButton.setEnabled(false);
        upYunRadioButton.setText("又拍云短信");
        panel2.add(upYunRadioButton, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        hwYunRadioButton = new JRadioButton();
        hwYunRadioButton.setEnabled(false);
        hwYunRadioButton.setText("华为云短信");
        panel2.add(hwYunRadioButton, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        eMailRadioButton = new JRadioButton();
        eMailRadioButton.setEnabled(false);
        eMailRadioButton.setText("E-Mail");
        panel2.add(eMailRadioButton, new GridConstraints(15, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        网易云信短信RadioButton = new JRadioButton();
        网易云信短信RadioButton.setEnabled(false);
        网易云信短信RadioButton.setText("网易云信短信");
        panel2.add(网易云信短信RadioButton, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        榛子云短信RadioButton = new JRadioButton();
        榛子云短信RadioButton.setEnabled(false);
        榛子云短信RadioButton.setText("榛子云短信");
        panel2.add(榛子云短信RadioButton, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        luosimao短信RadioButton = new JRadioButton();
        luosimao短信RadioButton.setEnabled(false);
        luosimao短信RadioButton.setText("Luosimao短信");
        panel2.add(luosimao短信RadioButton, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        极光短信RadioButton = new JRadioButton();
        极光短信RadioButton.setEnabled(false);
        极光短信RadioButton.setText("极光短信");
        panel2.add(极光短信RadioButton, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        极光推送RadioButton = new JRadioButton();
        极光推送RadioButton.setEnabled(false);
        极光推送RadioButton.setText("极光推送");
        panel2.add(极光推送RadioButton, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        企业号企业微信RadioButton = new JRadioButton();
        企业号企业微信RadioButton.setEnabled(false);
        企业号企业微信RadioButton.setText("企业号/企业微信");
        panel2.add(企业号企业微信RadioButton, new GridConstraints(16, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        钉钉RadioButton = new JRadioButton();
        钉钉RadioButton.setEnabled(false);
        钉钉RadioButton.setText("钉钉");
        panel2.add(钉钉RadioButton, new GridConstraints(17, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(8, 8, 8, 0), -1, -1));
        messageTypePanel.add(panel1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("WePush目前仅是各类消息官方SDK的一种实现，");
        panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("使用前请仔细查看该消息平台官网的使用规则和开发文档，尤其是发送频率限制等，避免造成不必要的麻烦");
        panel1.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return messageTypePanel;
    }

}
