package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M") // single table이므로 db입장에서 구분할 수 있는 무언가가 있어야됨.
@Getter @Setter
public class Movie extends Item{

    private String director;
    private String actor;
}
