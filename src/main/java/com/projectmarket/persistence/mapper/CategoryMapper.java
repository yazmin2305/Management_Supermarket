package com.projectmarket.persistence.mapper;

import com.projectmarket.domain.Category;
import com.projectmarket.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),

    })
    Category toCategory(Categoria categoria);//Convertir una categoria en category

    @InheritInverseConfiguration //MapStruct generará automáticamente el código necesario para mapear desde Categoria a Category
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
