package singleton.ex1;

public enum Properties {
    INSTANCE("Default_Name","Default_Type");

    private String name;
    private String type;

    Properties(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static Properties getInstance() {
        return INSTANCE;
    }
}
