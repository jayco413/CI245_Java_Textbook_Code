import javafx.print.PageLayout;
import javafx.print.PrinterJob;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PrinterJobDemo {

    private TextArea txtEditor;

    void print() {
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job == null) {
            // no printer: tell the user, and stop
        } else if (job.showPrintDialog(getStage())) {
            PageLayout layout = job.getJobSettings().getPageLayout();
            // for each page: build a node for it, then
            //     job.printPage(layout, pageNode);
            job.endJob();
        } else {
            job.cancelJob();
        }
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }
}
