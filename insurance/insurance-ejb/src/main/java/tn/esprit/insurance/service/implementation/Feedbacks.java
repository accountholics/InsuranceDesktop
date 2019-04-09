package tn.esprit.insurance.service.implementation;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.service.interfaces.IFeedbacksRemote;

@Stateless
public class Feedbacks implements IFeedbacksRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public int addFeeds(Feeds feed) {
		em.persist(feed);
		return feed.getId();
	}

	@Override
	public void removeFeeds(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFeeds(Feeds newFeed) {
		// TODO Auto-generated method stub

	}

	@Override
	public Feeds findFeedsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feeds> findAllFeeds() {
		// TODO Auto-generated method stub
		List<Feeds> emp = em.createQuery("Select f from Feeds f", Feeds.class).getResultList();
		return emp;
	}
	
	@Override
	public void getFeelings(String line){
	    Properties props = new Properties();
	    props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
	    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

	    // read some text in the text variable
	    String text = "I am feeling very happy and frustrated";

	    // create an empty Annotation just with the given text
	    Annotation document = new Annotation(text);

	    // run all Annotators on this text
	    pipeline.annotate(document);

	    System.out.println("ok");
//		 Properties props = new Properties();
//	        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
//	        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//	        int mainSentiment = 0;
//	        if (line != null && line.length() > 0) {
//	            int longest = 0;
//	            Annotation annotation = pipeline.process(line);
//	            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
//	                Tree tree = sentence.get(SentimentCoreAnnotations.AnnotatedTree.class);
//	                int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
//	                String partText = sentence.toString();
//	                if (partText.length() > longest) {
//	                    mainSentiment = sentiment;
//	                    longest = partText.length();
//	                }
//
//	            }
//	        }
//	        System.out.println(mainSentiment);
	}
}


