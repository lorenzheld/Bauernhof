public abstract class Huftier extends Tier {
    private int bodySize;

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }

    public Huftier(int bodySize) {
        this.bodySize = bodySize;
    }
}
