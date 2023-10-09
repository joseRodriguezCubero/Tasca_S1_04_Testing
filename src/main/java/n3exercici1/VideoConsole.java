package n3exercici1;

import java.util.Objects;

public class VideoConsole {

    private String name;
    private String company;

    public VideoConsole(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoConsole that = (VideoConsole) o;
        return Objects.equals(name, that.name) && Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "VideoConsole{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
