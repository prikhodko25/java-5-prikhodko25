package domain;

/**
 * The class Editor extends artist
 */
public class Editor extends Artist {

    /**
     *
     * Editor
     *
     * @param electronicEditing the electronic editing.
     * @param skiils            the skiils.
     * @param name              the name.
     * @param jobTitle          the job title.
     * @param level             the level.
     * @param dept              the dept.
     * @return public
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {

        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     *
     * Editor
     *
     * @param electronicEditing the electronic editing.
     * @param skiils            the skiils.
     * @return public
     */
    public Editor(boolean electronicEditing, String[] skiils) {

        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     *
     * Editor
     *
     * @param electronicEditing the electronic editing.
     * @return public
     */
    public Editor(boolean electronicEditing) {

        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     *
     * Editor
     *
     * @return public
     */
    public Editor() {

        super();
        this.electronicEditing = true;
    }

    @Override

    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;

    }

    private boolean electronicEditing;

    /**
     *
     * Gets the preferences
     *
     * @return the preferences
     */
    public boolean getPreferences() {

        return electronicEditing;
    }

    /**
     *
     * Sets the preferences
     *
     * @param electronic the electronic.
     */
    public void setPreferences(boolean electronic) {

        this.electronicEditing = electronic;
    }
}
