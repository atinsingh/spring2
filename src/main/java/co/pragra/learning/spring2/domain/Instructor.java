package co.pragra.learning.spring2.domain;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Instructor {
    private Long id;
    private Instant createDate;
    private Instant updateDate;
    private String avtarUrl;
    private String description;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }

    public String getAvtarUrl() {
        return avtarUrl;
    }

    public void setAvtarUrl(String avtarUrl) {
        this.avtarUrl = avtarUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", avtarUrl='" + avtarUrl + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
