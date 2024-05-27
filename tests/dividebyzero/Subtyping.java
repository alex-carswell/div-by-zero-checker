import org.checkerframework.checker.dividebyzero.qual.*;

// Test subtyping relationships for the Divide By Zero Checker.
// The file contains "// ::" comments to indicate expected errors and warnings.

class SubtypeTest {
  /// You will want a test like this for every pair of qualifiers in your type hierarchy.
  void top(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
    @Top Integer topToTop = top;
    @Top Integer topToNegativeOrZero = negativeOrZero;
    @Top Integer topToNonZero = nonZero;
    @Top Integer topToPositiveOrZero = positiveOrZero;
    @Top Integer topToNegative = negative;
    @Top Integer topToZero = zero;
    @Top Integer topToPositive = positive;
    @Top Integer topToBottom = bottom;
  }

  void negativeOrZero(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
    // :: error: assignment
    @NegativeOrZero Integer negativeOrZeroToTop = top;
    @NegativeOrZero Integer negativeOrZeroToNegativeOrZero = negativeOrZero;
    // :: error: assignment
    @NegativeOrZero Integer negativeOrZeroToNonZero = nonZero;
    // :: error: assignment
    @NegativeOrZero Integer negativeOrZeroToPositiveOrZero = positiveOrZero;
    @NegativeOrZero Integer negativeOrZeroToNegative = negative;
    @NegativeOrZero Integer negativeOrZeroToZero = zero;
    // :: error: assignment
    @NegativeOrZero Integer negativeOrZeroToPositive = positive;
    @NegativeOrZero Integer negativeOrZeroToBottom = bottom;
  }

  void positiveOrZero(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
      // :: error: assignment
    @PositiveOrZero Integer positiveOrZeroToTop = top;
    // :: error: assignment
    @PositiveOrZero Integer positiveOrZeroToNegativeOrZero = negativeOrZero;
    // :: error: assignment
    @PositiveOrZero Integer positiveOrZeroToNonZero = nonZero;
    @PositiveOrZero Integer positiveOrZeroToPositiveOrZero = positiveOrZero;
    // :: error: assignment
    @PositiveOrZero Integer positiveOrZeroToNegative = negative;
    @PositiveOrZero Integer positiveOrZeroToZero = zero;
    @PositiveOrZero Integer positiveOrZeroToPositive = positive;
    @PositiveOrZero Integer positiveOrZeroToBottom = bottom;
  }

  void nonZero(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
    // :: error: assignment
    @NonZero Integer nonZeroToTop = top;
    // :: error: assignment
    @NonZero Integer nonZeroToNegativeOrZero = negativeOrZero;
    @NonZero Integer nonZeroToNonZero = nonZero;
    // :: error: assignment
    @NonZero Integer nonZeroToPositiveOrZero = positiveOrZero;
    @NonZero Integer nonZeroToNegative = negative;
    // :: error: assignment
    @NonZero Integer nonZeroToZero = zero;
    @NonZero Integer nonZeroToPositive = positive;
    @NonZero Integer nonZeroToBottom = bottom;
  }

  void negative(@Negative Integer neg, @Top Integer top, @NegativeOrZero Integer noz, @NonZero Integer nz,
  @PositiveOrZero Integer poz, @Zero Integer z, @Positive Integer pos, @Bottom Integer btm) {
 
    @Negative Integer a = neg;
    // :: error: assignment
    @Negative Integer b = top;
    // :: error: assignment
    @Negative Integer c = noz;
    // :: error: assignment
    @Negative Integer d = poz;
    // :: error: assignment
    @Negative Integer e = z;
    // :: error: assignment
    @Negative Integer f = pos;
    @Negative Integer g = btm;
  }

  void zero(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
    // :: error: assignment
    @Zero Integer zeroToTop = top;
    // :: error: assignment
    @Zero Integer zeroToNegativeOrZero = negativeOrZero;
    // :: error: assignment
    @Zero Integer zeroToNonZero = nonZero;
    // :: error: assignment
    @Zero Integer zeroToPositiveOrZero = positiveOrZero;
    // :: error: assignment
    @Zero Integer zeroToNegative = negative;
    @Zero Integer zeroToZero = zero;
    // :: error: assignment
    @Zero Integer zeroToPositive = positive;
    @Zero Integer zeroToBottom = bottom;
  }

  void positive(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
    // :: error: assignment
    @Positive Integer positiveToTop = top;
    // :: error: assignment
    @Positive Integer positiveToNegativeOrZero = negativeOrZero;
    // :: error: assignment
    @Positive Integer positiveToNonZero = nonZero;
    // :: error: assignment
    @Positive Integer positiveToPositiveOrZero = positiveOrZero;
    // :: error: assignment
    @Positive Integer positiveToNegative = negative;
    // :: error: assignment
    @Positive Integer positiveToZero = zero;
    @Positive Integer positiveToPositive = positive;
    @Positive Integer positiveToBottom = bottom;
  }

  void bottom(
    @Top Integer top,
    @NegativeOrZero Integer negativeOrZero,
    @NonZero Integer nonZero,
    @PositiveOrZero Integer positiveOrZero,
    @Negative Integer negative,
    @Zero Integer zero,
    @Positive Integer positive,
    @Bottom Integer bottom) {
    // :: error: assignment
    @Bottom Integer bottomToTop = top;
    // :: error: assignment
    @Bottom Integer bottomToNegativeOrZero = negativeOrZero;
    // :: error: assignment
    @Bottom Integer bottomToNonZero = nonZero;
    // :: error: assignment
    @Bottom Integer bottomToPositiveOrZero = positiveOrZero;
    // :: error: assignment
    @Bottom Integer bottomToNegative = negative;
    // :: error: assignment
    @Bottom Integer bottomToZero = zero;
    // :: error: assignment
    @Bottom Integer bottomToPositive = positive;
    @Bottom Integer bottomToBottom = bottom;
  }
}
