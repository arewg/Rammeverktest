package cashierDir.Storage;

public class Store {

    private int id;
    private String name;

    public final static class Builder{

        private int id;
        private String name;

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Store build() {
            return new Store(this);
        }
    }

    public Store(Store.Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
