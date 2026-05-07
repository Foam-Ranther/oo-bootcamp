package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

  @Test
  void shouldRepresentChanceOfGettingTails() throws ImpossibleProbabilityError {
    Probability probabilityOfTails = Probability.create(0.5);
    assertEquals(probabilityOfTails, Probability.create(0.5));
  }

  @Test
  void shouldRepresentChanceOfNotGettingTails() throws ImpossibleProbabilityError {
    Probability probabilityOfNotGettingTails = Probability.create(0.5);
    assertEquals(Probability.create(0.5), probabilityOfNotGettingTails.not());
  }

  @Test
  void shouldThrowErrorIfProbabilityIsImpossible() {
    assertThrows(ImpossibleProbabilityError.class, () -> Probability.create(-2));
  }

  @Test
  void shouldRepresentChanceOfGettingTailsOn2Coins() throws ImpossibleProbabilityError {
    Probability probabilityOfGettingTail = Probability.create(0.5);

    assertEquals(Probability.create(0.25), probabilityOfGettingTail.and(probabilityOfGettingTail));
  }

  @Test
  void shouldRepresentChanceOfGettingAtLeastOneTailsOn2Coins() throws ImpossibleProbabilityError {
    Probability probabilityOfGettingTail = Probability.create(0.5);
    Probability probabilityOfNotGettingTail = probabilityOfGettingTail.not();

    assertEquals(Probability.create(0.75), probabilityOfNotGettingTail.or(probabilityOfGettingTail));
  }

  @Test
  void shouldRepresentProbabilityOfGettingAtLeastOnceUsingOrDeMorgon() throws ImpossibleProbabilityError {
    Probability probabilityOfGettingTail = Probability.create(0.5);
    Probability probabilityOfNotGettingTail = probabilityOfGettingTail.not();

    assertEquals(Probability.create(0.75), probabilityOfNotGettingTail.orDeMorgon(probabilityOfGettingTail));
  }
}