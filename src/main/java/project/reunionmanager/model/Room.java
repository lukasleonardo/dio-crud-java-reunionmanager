package project.reunionmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="meetingroom")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "data" , nullable = false)
    private String data;

    @Column(name = "startHour" , nullable = false)
    private String startHour;

    @Column(name = "endHour" , nullable = false)
    private String endHour;



    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}


