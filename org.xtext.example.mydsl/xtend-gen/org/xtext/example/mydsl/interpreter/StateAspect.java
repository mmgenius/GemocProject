package org.xtext.example.mydsl.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import stateMachine.State;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public void step(final String inputString) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined"
      + "\nThe method or field trigger is undefined for the type Object"
      + "\nThe method or field _self is undefined"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\noutgoing cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nfsm cannot be resolved"
      + "\noutputBuffer cannot be resolved"
      + "\nenqueue cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nget cannot be resolved"
      + "\nfire cannot be resolved");
  }
}
