package io.vertx.sqlclient.template;

/**
 * Mapper for {@link UserDataObject}.
 * NOTE: This class has been automatically generated from the {@link UserDataObject} original class using Vert.x codegen.
 */
public class UserDataObjectMapper {

  public static final java.util.function.Function<io.vertx.sqlclient.Row, UserDataObject> READER = UserDataObjectMapper::fromRow;

  public static final java.util.stream.Collector<io.vertx.sqlclient.Row, ?, java.util.List<UserDataObject>> COLLECTOR = java.util.stream.Collectors.mapping(READER, java.util.stream.Collectors.toList());

  public static UserDataObject fromRow(io.vertx.sqlclient.Row row) {
    UserDataObject obj = new UserDataObject();
    Object val;
    val = row.getString("firstName");
    if (val != null) {
      obj.setFirstName((java.lang.String)val);
    }
    val = row.getLong("id");
    if (val != null) {
      obj.setId((long)val);
    }
    val = row.getString("lastName");
    if (val != null) {
      obj.setLastName((java.lang.String)val);
    }
    return obj;
  }

  public static final java.util.function.Function<UserDataObject, java.util.Map<String, Object>> PARAMS = UserDataObjectMapper::toParams;

  public static java.util.Map<String, Object> toParams(UserDataObject obj) {
    java.util.Map<String, Object> params = new java.util.HashMap<>();
    params.put("first_name", obj.getFirstName());
    params.put("id", obj.getId());
    params.put("last_name", obj.getLastName());
    return params;
  }
}