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

public final class Province_Adapter extends ModelAdapter<Province> {
  public Province_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Province> getModelClass() {
    return Province.class;
  }

  public final String getTableName() {
    return "`Province`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Province_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Province model) {
    values.put(Province_Table.id.getCursorKey(), model.id);
    if (model.name != null) {
      values.put(Province_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Province_Table.name.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Province model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Province model, int start) {
    statement.bindLong(1 + start, model.id);
    if (model.name != null) {
      statement.bindString(2 + start, model.name);
    } else {
      statement.bindNull(2 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Province model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Province`(`id`,`name`) VALUES (?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Province`(`id`,`name`) VALUES (?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Province`(`id` INTEGER,`name` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Province model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
  }

  @Override
  public final boolean exists(Province model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Province.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Province model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Province_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Province newInstance() {
    return new Province();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Province_Table.getProperty(name);
  }
}
