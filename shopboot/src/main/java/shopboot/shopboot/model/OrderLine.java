package shopboot.shopboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_line")

public class OrderLine {
    @Id
    @Column
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order = new Order();


    @ManyToOne
    @JoinColumn
    private Goods goods = new Goods();

    @Column
    private Integer count;

}
