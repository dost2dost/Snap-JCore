package DependencyInversions;

/**
 * Created by DostM on 7/16/2020.
 */
//High Level Class
public class EbookReader {
    private Book book;

    public EbookReader(Book book) {
        this.book = book;
    }
    public void read(PdfBook pdfBook){
        System.out.println("Read a pdf book ");

    }
}
