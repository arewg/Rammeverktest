package cashierDir.Storage;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Item {

    /////////////////////
    // FIELD VARIABLES //
    /////////////////////
    private int id;
    private String name;
    private int partNumber;
    private int EANNumber;
    private String category;
    private String subCategory;
    private Enum<SoldByWeight> soldByWeight;
    private String manufacturer;
    private String supplier;
    private float buyInPrice;
    private float priceWithoutTax;
    private float priceWithTax;
    private float tax;
    private int numberInStock;
    private String status; // Kanskje denne eller assortmentcode under kan fjernes.
    private Enum<AssortmentCodes> assortment;
    private int belongsToStoreId;

    /////////////////
    //   BUILDER   //
    /////////////////
    public final static class Builder {

        private int id;
        private String name;
        private int partNumber;
        private int EANNumber;
        private String category;
        private String subCategory;
        private Enum<SoldByWeight> soldByWeight;
        private String manufacturer;
        private String supplier;
        private float buyInPrice;
        private float priceWithoutTax;
        private float priceWithTax;
        private float tax;
        private int numberInStock;
        private String status; // Kanskje denne eller assortmentcode under kan fjernes.
        private Enum<AssortmentCodes> assortment;
        private int belongsToStoreId;

        @Contract(pure = true)
        public Builder (){}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPartNumber(int partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        public Builder setEANNumber(int EANNumber) {
            this.EANNumber = EANNumber;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setSubCategory(String subCategory) {
            this.subCategory = subCategory;
            return this;
        }

        public Builder setSoldByWeight(Enum<SoldByWeight> soldByWeight) {
            this.soldByWeight = soldByWeight;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }

        public Builder setBuyInPrice(float buyInPrice) {
            this.buyInPrice = buyInPrice;
            return this;
        }

        public Builder setPriceWithoutTax(float priceWithoutTax) {
            this.priceWithoutTax = priceWithoutTax;
            return this;
        }

        public Builder setPriceWithTax(float priceWithTax) {
            this.priceWithTax = priceWithTax;
            return this;
        }

        public Builder setTax(float tax) {
            this.tax = tax;
            return this;
        }

        public Builder setNumberInStock(int numberInStock) {
            this.numberInStock = numberInStock;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setAssortment(Enum<AssortmentCodes> assortment) {
            this.assortment = assortment;
            return this;
        }

        public Builder setBelongsToStoreId(int belongsToStoreId) {
            this.belongsToStoreId = belongsToStoreId;
            return this;
        }

        public Item build() {return new Item(this);}
    }

    /////////////////////
    // CONSTRUCTOR FOR //
    //   NEW ITEMS     //
    /////////////////////
    @Contract(pure = true)
    private Item(@NotNull Item.Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.partNumber = builder.partNumber;
        this.EANNumber = builder.EANNumber;
        this.category = builder.category;
        this.subCategory = builder.subCategory;
        this.soldByWeight = builder.soldByWeight;
        this.manufacturer = builder.manufacturer;
        this.supplier = builder.supplier;
        this.buyInPrice = builder.buyInPrice;
        this.priceWithoutTax = builder.priceWithoutTax;
        this.priceWithTax = builder.priceWithTax;
        this.tax = builder.tax;
        this.numberInStock = builder.numberInStock;
        this.status = builder.status;
        this.assortment = builder.assortment;
        this.belongsToStoreId = builder.belongsToStoreId;
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

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public int getEANNumber() {
        return EANNumber;
    }

    public void setEANNumber(int EANNumber) {
        this.EANNumber = EANNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Enum<SoldByWeight> getSoldByWeight() {
        return soldByWeight;
    }

    public void setSoldByWeight(Enum<SoldByWeight> soldByWeight) {
        this.soldByWeight = soldByWeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public float getBuyInPrice() {
        return buyInPrice;
    }

    public void setBuyInPrice(float buyInPrice) {
        this.buyInPrice = buyInPrice;
    }

    public float getPriceWithoutTax() {
        return priceWithoutTax;
    }

    public void setPriceWithoutTax(float priceWithoutTax) {
        this.priceWithoutTax = priceWithoutTax;
    }

    public float getPriceWithTax() {
        return priceWithTax;
    }

    public void setPriceWithTax(float priceWithTax) {
        this.priceWithTax = priceWithTax;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Enum<AssortmentCodes> getAssortment() {
        return assortment;
    }

    public void setAssortment(Enum<AssortmentCodes> assortment) {
        this.assortment = assortment;
    }

    public int getBelongsToStoreId() {
        return belongsToStoreId;
    }

    public void setBelongsToStoreId(int belongsToStoreId) {
        this.belongsToStoreId = belongsToStoreId;
    }
}
