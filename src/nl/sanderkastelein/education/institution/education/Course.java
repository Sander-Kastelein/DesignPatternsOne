package nl.sanderkastelein.education.institution.education;

public class Course {

    private Education education;
    private String name;
    private String description;

    public Course(Education education, String name, String description){
        this.education = education;
        this.name = name;
        this.description = description;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
