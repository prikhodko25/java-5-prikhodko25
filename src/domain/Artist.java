package domain;

/**
 * The class Artist extends employee
 */
public class Artist extends Employee {

    /**
     *
     * Artist
     *
     * @param skiils   the skiils.
     * @param name     the name.
     * @param jobTitle the job title.
     * @param level    the level.
     * @param dept     the dept.
     * @return public
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {

        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     *
     * Artist
     *
     * @param skiils the skiils.
     * @return public
     */
    public Artist(String[] skiils) {

        super();
        this.skiils = skiils;
    }

    /**
     *
     * Artist
     *
     * @return public
     */
    public Artist() {

        super();
        this.skiils = new String[10];
    }

    @Override

    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        return super.toString() + "\nSkills: " + getSkills();
    }

    private String[] skiils;

    /**
     *
     * Gets the skills
     *
     * @return the skills
     */
    public String getSkills() {

        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     *
     * Sets the skills
     *
     * @param skills the skills.
     */
    public void setSkills(String[] skills) {

        this.skiils = skills;
    }

    /**
     *
     * Gets the skills L sist
     *
     * @return the skills L sist
     */
    public String[] getSkillsLSist() {

        return skiils;
    }
}
