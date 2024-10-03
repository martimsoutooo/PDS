package Ex3;

public class Document {
    private int id;
    private String name;
    private String[] content;

    public Document(String name) {
        if (id == 0) {
            id = 1;
        }
        else {
            id++;
        }
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String[] getContent() {
        return this.content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
