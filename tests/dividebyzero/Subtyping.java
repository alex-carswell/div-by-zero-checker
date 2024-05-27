import org.checkerframework.checker.dividebyzero.qual.*;

// Test subtyping relationships for the Divide By Zero Checker.
// The file contains "// ::" comments to indicate expected errors and warnings.

class SubtypeTest {
  // You will want a test like this for every pair of qualifiers in your type hierarchy.
  void oneSubtypingRelationship(@Top Integer x, @Bottom Integer y) {
    @Top Integer a = x;
    @Top Integer b = y;
    // :: error: assignment
    @Bottom Integer c = x; // expected error on this line, as indicated just above
    @Bottom Integer d = y;
  }

  void anotherSubtypingRelationship(@Top Integer x, @NegativeOrZero Integer y) {
    @Top Integer a = x;
    @Top Integer b = y;
    // :: error: assignment
    @NegativeOrZero Integer c = x; // expected error on this line, as indicated just above
    @NegativeOrZero Integer d = y;
  }
}
