package cn.taike.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

/**
 * Created by huayandong on 17/7/24.
 */
@Entity
@Table(name = "book")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Book {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "project_name")
    private String projectName;

    @Column
    private String type;

    private String cover;

    private String video;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Book() {
    }

    public Book(Integer id, String bookName, String projectName, String type, String cover, String video) {
        this.id = id;
        this.bookName = bookName;
        this.projectName = projectName;
        this.type = type;
        this.cover = cover;
        this.video = video;
    }

    public Book(String bookName, String projectName, String type, String cover, String video) {
        this.bookName = bookName;
        this.projectName = projectName;
        this.type = type;
        this.cover = cover;
        this.video = video;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", type='" + type + '\'' +
                ", cover='" + cover + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
