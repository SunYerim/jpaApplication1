package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A") // single table이므로 db입장에서 구분할 수 있는 무언가가 있어야됨.
@Getter @Setter
public class Album extends Item{

    private String artist;
    private String etc;
}
