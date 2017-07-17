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

public final class County_Adapter extends ModelAdapter<County> {
  public County_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<County> getModelClass() {
    return County.class;
  }

  public final String getTableName() {
    return "`County`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return County_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, County model) {
    values.put(County_Table.id.getCursorKey(), model.id);
    values.put(County_Table.city_id.getCursorKey(), model.city_id);
    if (model.name != null) {
      values.put(County_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(County_Table.name.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, County model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, County model, int start) {
    statement.bindLong(1 + start, model.id);
    statement.bindLong(2 + start, model.city_id);
    if (model.name != null) {
      statement.bindString(3 + start, model.name);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, County model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `County`(`id`,`city_id`,`name`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `County`(`id`,`city_id`,`name`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `County`(`id` INTEGER,`city_id` INTEGER,`name` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, County model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexcity_id = cursor.getColumnIndex("city_id");
    if (indexcity_id != -1 && !cursor.isNull(indexcity_id)) {
      model.city_id = cursor.getInt(indexcity_id);
    } else {
      model.city_id = 0;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
  }

  @Override
  public final boolean exists(County model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(County.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(County model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(County_Table.id.eq(model.id));return clause;
  }

  @Override
  public final County newInstance() {
    return new County();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return County_Table.getProperty(name);
  }
}
