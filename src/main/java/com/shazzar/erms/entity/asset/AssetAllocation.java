package com.shazzar.erms.entity.asset;

import com.shazzar.erms.entity.project.Project;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class AssetAllocation {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "asset_id",
            referencedColumnName = "id")
    private Asset asset;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "project_id",
            referencedColumnName = "id")
    private Project project;

    @Column
    private LocalDateTime allocationDate;

    @Column
    private LocalDateTime returnDate;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        AssetAllocation that = (AssetAllocation) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
