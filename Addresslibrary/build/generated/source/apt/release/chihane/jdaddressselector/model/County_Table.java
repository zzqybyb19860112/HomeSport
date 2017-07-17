package chihane.jdaddressselector.model;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.IllegalArgumentException;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class County_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return chihane.jdaddressselector.model.County_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(County.class, "id");

  public static final IntProperty city_id = new IntProperty(County.class, "city_id");

  public static final Property<String> name = new Property<String>(County.class, "name");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,city_id,name};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`city_id`":  {
        return city_id;
      }
      case "`name`":  {
        return name;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
