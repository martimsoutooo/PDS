package Ex3;

public class PrintJob implements Runnable {
    private Document document;
    private int jobId;

    public PrintJob(Document document, int jobId) {
        this.document = document;
        this.jobId = jobId;
    }

    public Document getDocument() {
        return document;
    }

    public int getJobId() {
        return jobId;
    }

    @Override
    public void run() {
        System.out.println("Printing job " + jobId + "...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Document printed: \"" + document.getContent()[0].substring(0, Math.min(20, document.getContent()[0].length()-1)) + "...\"");
    }
}
