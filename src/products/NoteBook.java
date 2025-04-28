package src.products;

import java.util.Random;

public class NoteBook extends Product{
    private int pageCount;
    private boolean isHardCover;

    public NoteBook (String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setIsHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }

    public boolean getIsHardCover() {
        return isHardCover;
    }

    @Override
    public String toString() {
        return super.toString() + "Page Count: " + getPageCount() + "\nIs Hard Cover: " + getIsHardCover();
    }

    @Override
    protected String generateId() {
        Random random = new Random();
        int randomNumber = 100 + random.nextInt(900);
        return 2 + Integer.toString(randomNumber);
    }
}
