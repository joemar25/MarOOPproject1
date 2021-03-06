public class Object_Candidate {

    private String lastName, firstName, initial, suffix, politicalParty, educationalBackground, chosenPosition,
            crimeRecord, isQualified;

    public Object_Candidate(String lastName, String firstName, String initial, String suffix, String politicalParty,
            String educationalBackground, String chosenPosition, String crimeRecord, String isQualified) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setInitial(initial);
        this.setSuffix(suffix);
        this.setPoliticalParty(politicalParty);
        this.setEducationalBackground(educationalBackground);
        this.setChosenPosition(chosenPosition);
        this.setCrimeRecord(crimeRecord);
        this.setIsQualified(isQualified);
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInitial() {
        return initial;
    }

    private void setInitial(String initial) {
        this.initial = initial;
    }

    public String getSuffix() {
        return suffix;
    }

    private void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    private void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    private void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public String getChosenPosition() {
        return chosenPosition;
    }

    private void setChosenPosition(String chosenPosition) {
        this.chosenPosition = chosenPosition;
    }

    public String getCrimeRecord() {
        return crimeRecord;
    }

    private void setCrimeRecord(String crimeRecord) {
        this.crimeRecord = crimeRecord;
    }

    public String getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(String isQualified) {
        this.isQualified = isQualified;
    }

    @Override
    public String toString() {
        return String.format(
                "Full Name: %s, %s %s %s\nPolitical Party: %s\nEducational Background: %s\nRunning for: %s\nCriminal Record: %s",
                this.getLastName(), this.getFirstName(), this.getInitial(),
                this.getSuffix(), this.getPoliticalParty(), this.getEducationalBackground(), this.getChosenPosition(),
                this.getCrimeRecord());
    }

}
