package Ex3;

import java.util.ArrayList;
import java.util.List;

public class BasicPrinterAdapter implements AdvancedPrinterInterface{
    private BasicPrinter basicPrinter;

    public BasicPrinterAdapter(BasicPrinter basicPrinter) {
        this.basicPrinter = basicPrinter;
    }

    @Override
    public int print(Document doc) {
        if (basicPrinter.hasInk() && basicPrinter.hasPaper()) {
            basicPrinter.print(doc.getContent());
            return doc.getId();
        }
        System.out.println("Failed to print: " + doc.getName());
        return -1;
    }

    @Override
    public List<Integer> print(List<Document> docs) {
        List<Integer> jobIds = new ArrayList<Integer>();
        for (Document doc : docs) {
            int id = print(doc);
            if (id != -1) {
                jobIds.add(id);
            }
        }
        return jobIds;
    }

    @Override
    public void showQueuedJobs() {}

    @Override
    public boolean cancelJob(int jobId) { return false; }

    @Override
    public void cancelAll() {}

}
