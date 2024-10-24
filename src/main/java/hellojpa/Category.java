package hellojpa;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // 셀프 양방향 관계
    // 자식입장에서 부모는 하나
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    // 부모입장에서 자식은 여러개임
    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    // 중간 매핑테이블 생성
    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITME_ID"))
    private List<Item> items = new ArrayList<>();
}
