package train.common.api;

public class TextureDescription {
    final public String title;
    final public String description;
    public TextureDescription(String title, String description) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = null;
        }
        if (description != null && !description.isEmpty()) {
            this.description = description;
        } else {
            this.description = null;
        }
    }
}
