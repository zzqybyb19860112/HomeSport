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

public final class Street_Adapter extends ModelAdapter<Street> {
  public Street_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Street> getModelClass() {
    return Street.class;
  }

  public final String getTableName() {
    return "`Street`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Street_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Street model) {
    values.put(Street_Table.id.getCursorKey(), model.id);
    values.put(Street_Table.county_id.getCursorKey(), model.county_id);
    if (model.name != null) {
      values.put(Street_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Street_Table.name.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Street model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Street model, int start) {
    statement.bindLong(1 + start, model.id);
    statement.bindLong(2 + start, model.county_id);
    if (model.name != null) {
      statement.bindString(3 + start, model.name);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Street model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Street`(`id`,`county_id`,`name`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Street`(`id`,`county_id`,`name`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Street`(`id` INTEGER,`county_id` INTEGER,`name` TEXT, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Street model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexcounty_id = cursor.getColumnIndex("county_id");
    if (indexcounty_id != -1 && !cursor.isNull(indexcounty_id)) {
      model.county_id = cursor.getInt(indexcounty_id);
    } else {
      model.county_id = 0;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
  }

  @Override
  public final boolean exists(Street model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Street.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Street model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Street_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Street newInstance() {
    return new Street();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Street_Table.getProperty(name);
  }
}
