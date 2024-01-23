package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") // 연관관계의(매핑된) 거울이다.
    // 가급적 변경 x , 컬랙션을 필드에다 바로 초기화하는 것이 가장 좋다.
    private List<Order> orders = new ArrayList<>();
}
