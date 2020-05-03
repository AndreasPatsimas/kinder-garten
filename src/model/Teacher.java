package model;

public class Teacher {

    private Integer id;

    private String fullName;

    private Long insuranceNumber;

    public Teacher() {
    }

    public Teacher(Integer id, String fullName, Long insuranceNumber) {
        this.id = id;
        this.fullName = fullName;
        this.insuranceNumber = insuranceNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(Long insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                '}';
    }
}
