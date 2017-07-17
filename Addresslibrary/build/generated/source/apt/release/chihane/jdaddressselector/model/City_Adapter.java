package chihane.jdaddressselector.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

public final class City_Adapter extends ModelAdapter<City> {
  public City_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<City> getModelClass() {
    return City.class;
  }

  public final String getTableName() {
    return "`City`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return City_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, City model) {
    values.put(City_Table.id.getCursorKey(), model.id);
    values.put(City_Table.province_id.getCursorKey(), model.province_id);
    if (model.name != null) {
      values.put(City_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(City_Table.name.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, City model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, City model, int start) {
    statement.bindLong(1 + start, model.id);
    statement.bindLong(2 + start, model.province_id);
    if (model.name != null) {
      statement.bindString(3 + start, model.name);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, City model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `City`(`id`,`province_id`,`name`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `City`(`id`,`province_id`,`name`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `City`(`id` INTEGER,`province_id` INTEGER,`name` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, City model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexprovince_id = cursor.getColumnIndex("province_id");
    if (indexprovince_id != -1 && !cursor.isNull(indexprovince_id)) {
      model.province_id = cursor.getInt(indexprovince_id);
    } else {
      model.province_id = 0;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
  }

  @Override
  public final boolean exists(City model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(City.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(City model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(City_Table.id.eq(model.id));return clause;
  }

  @Override
  public final City newInstance() {
    return new City();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return City_Table.getProperty(name);
  }
}
