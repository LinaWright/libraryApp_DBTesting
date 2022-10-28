package com.cydeo.steps;

import com.cydeo.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class UsersDBStepDefs {
    @Given("Establish the database connection")
    public void establish_the_database_connection() {
        DB_Util.runQuery("select * from users;");
    }

    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {
        DB_Util.runQuery("select id from users;");
    }

    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {
        DB_Util.runQuery("select count(id) from users;");
        Integer totalIDCount = DB_Util.getRowCount();
        DB_Util.runQuery("select count(distinct id) from users;");
        Integer uniqueIDCount = DB_Util.getRowCount();
        Assert.assertEquals(totalIDCount, uniqueIDCount);
    }

    @When("Execute query to get all columns")
    public void execute_query_to_get_all_columns() {
        DB_Util.runQuery("select * from users;");
        DB_Util.getAllColumnNamesAsList();
    }

    @Then("verify the below columns are listed in result")
    public void verify_the_below_columns_are_listed_in_result(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
}
