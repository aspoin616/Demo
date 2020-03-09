package shopboot.shopboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderTable")

public class Order {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "client")
    private String client;
    @Column(name = "date")
    private Date date;
    @Column(name = "address")
    private String address;


}
