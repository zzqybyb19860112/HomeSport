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
public final class Street_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return chihane.jdaddressselector.model.Street_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(Street.class, "id");

  public static final IntProperty county_id = new IntProperty(Street.class, "county_id");

  public static final Property<String> name = new Property<String>(Street.class, "name");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,county_id,name};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`county_id`":  {
        return county_id;
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
