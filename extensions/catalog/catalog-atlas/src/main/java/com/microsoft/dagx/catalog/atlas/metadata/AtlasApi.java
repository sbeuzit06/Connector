package com.microsoft.dagx.catalog.atlas.metadata;

import org.apache.atlas.model.instance.AtlasEntity;
import org.apache.atlas.model.typedef.AtlasTypesDef;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AtlasApi {
    AtlasTypesDef createClassifications(String... classificationName);
    void deleteClassification(String ... classificationName);

    AtlasTypesDef createCustomTypes(String typeName, Set<String> superTypeNames, List<AtlasCustomTypeAttribute> attributes);
    void deleteCustomType(String typeName);
    void deleteType(List<AtlasTypesDef> type);

    AtlasEntity getEntityById(String id);
    String createEntity(String entityTypeName, Map<String, Object> properties);
    void deleteEntities(List<String> entityGuids);


}