package Utilities;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by lldtien on 7/26/2017.
 */
public class PaginationTagLib extends SimpleTagSupport {

    private final static int FIRST_PAGE = 1;
    private final static int NUM_PAGE_RANGE = 3;
    public final static int NUM_PER_PAGE = 10;


    private String uri;
    private int pages;
    private int count;
    private int max = NUM_PER_PAGE;
    public int numPerPages = NUM_PER_PAGE;
    private String previous = "&lt;";
    private String next = "&gt;";
    private String first = "&laquo;";
    private String last = "&raquo;";
    private int totalPage = 0;
    private Writer out;

    private Writer getWriter() {
        Writer out = getJspContext().getOut();
        return out;
    }

    @Override
    public void doTag() throws JspException, IOException {
        out = getWriter();
        try {
            writeHead();
            writePreviousButton();
            writeIndexButtons();
            writeNextButton();
            writeTail();
        } catch (IOException ex) {
            throw new JspException("Error in Paginator tag", ex);
        }
    }

    private void writeHead() throws IOException {
        out.write("<nav>");
        out.write("<ul class =\"pagination\">");
        out.write(constructLink(FIRST_PAGE, first, false, true));
    }

    private void writePreviousButton() throws IOException {
        if (pages <= FIRST_PAGE)
            out.write(constructLink(FIRST_PAGE, previous, true, true));
        else
            out.write(constructLink(pages - 1, previous, false, true));
    }

    private void writeIndexButtons() throws IOException {
        int totalPage = count % numPerPages == 0 ? count / numPerPages : count / numPerPages + 1;

        if (pages >= NUM_PAGE_RANGE && pages <= totalPage - NUM_PAGE_RANGE + FIRST_PAGE) {

            out.write(constructLink(pages, "...", true, false));
            for (int i = pages - NUM_PAGE_RANGE + FIRST_PAGE; i < pages + NUM_PAGE_RANGE; ++i) {
                if (i == pages) out.write(constructLink(pages, String.valueOf(pages), true, true));
                else out.write(constructLink(i, String.valueOf(i), false, false));
            }
            out.write(constructLink(pages, "...", true, false));
        } else if (pages < NUM_PAGE_RANGE) {
            for (int i = FIRST_PAGE; i <= NUM_PAGE_RANGE; ++i) {
                if (i == pages) out.write(constructLink(pages, String.valueOf(pages), true, true));
                else out.write(constructLink(i, String.valueOf(i), false, false));
            }
            out.write(constructLink(pages, "...", true, false));
        } else if (pages > totalPage - NUM_PAGE_RANGE + FIRST_PAGE) {
            out.write(constructLink(pages, "...", true, false));
            for (int i = totalPage - NUM_PAGE_RANGE + 1; i <= totalPage; ++i) {
                if (i == pages) out.write(constructLink(pages, String.valueOf(pages), true, true));
                else out.write(constructLink(i, String.valueOf(i), false, false));
            }
        }

    }

    private void writeNextButton() throws IOException {
        if ((pages + 1) * numPerPages > count)
            out.write(constructLink(pages + 1, next, true, true));
        else
            out.write(constructLink(pages + 1, next, false, true));
    }

    private void writeTail() throws IOException {
        out.write(constructLink(count / numPerPages, last, false, true));
        out.write("</ul>");
        out.write("</nav>");
    }

    private String constructLink(int page, String text, boolean disable, boolean isPicked) {
        StringBuilder link = new StringBuilder("<li>");
        String classpicked = isPicked ? "picked" : "unpicked";
        if (disable)
            link.append("<a class=\"" + classpicked + "\">" + text + "</a></li>");
        else
            link.append("<a class=\"" + classpicked + "\" href=\"" + uri + "?pages=" + page + "\">" + text + "</a></li>");
        return link.toString();
    }

    private boolean hasClassTag(String classname) {
        return classname != null;
    }

    public String getUri() {
        return uri;
    }

    public int getPages() {
        return pages;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public int getNumPerPages() {
        return numPerPages;
    }

    public String getPrevious() {
        return previous;
    }

    public String getNext() {
        return next;
    }

    public Writer getOut() {
        return out;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setNumPerPages(int numPerPages) {
        this.numPerPages = numPerPages;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setOut(Writer out) {
        this.out = out;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}
