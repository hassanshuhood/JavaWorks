package work.src.thread.RestThreadRun;

public class DataParams {
    private Integer messageId;
    private Long downloadRequestId;
    private String emailSubject;
    private String senderEmailAddress;
    private String emailSentDate;
    private String statusCode;
    private String emailContent;

    public DataParams(Integer messageId) {
        super();
        this.messageId = messageId;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setSenderEmailAddress(String senderEmailAddress) {
        this.senderEmailAddress = senderEmailAddress;
    }

    public String getSenderEmailAddress() {
        return senderEmailAddress;
    }

    public void setEmailSentDate(String emailSentDate) {
        this.emailSentDate = emailSentDate;
    }

    public String getEmailSentDate() {
        return emailSentDate;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setDownloadRequestId(Long downloadRequestId) {
        this.downloadRequestId = downloadRequestId;
    }

    public Long getDownloadRequestId() {
        return downloadRequestId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getEmailContent() {
        return emailContent;
    }

    @Override
    public String toString() {
        return ("messageId:" + messageId + ", downloadRequestId: " + downloadRequestId + ", emailSubject: " + emailSubject + ", senderEmailAddress: " + senderEmailAddress
                           + ", emailSentDate:" + emailSentDate + ", statusCode: " + statusCode);
    }


}
