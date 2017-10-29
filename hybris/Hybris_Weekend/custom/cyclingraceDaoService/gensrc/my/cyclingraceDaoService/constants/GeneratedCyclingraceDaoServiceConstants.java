/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 19.00.15                        ---
 * ----------------------------------------------------------------
 */
package my.cyclingraceDaoService.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedCyclingraceDaoServiceConstants
{
	public static final String EXTENSIONNAME = "cyclingraceDaoService";
	public static class TC
	{
		public static final String CYCLIST = "Cyclist".intern();
		public static final String CYCLISTRANKING = "CyclistRanking".intern();
		public static final String STAGE = "Stage".intern();
		public static final String STAGERACE = "StageRace".intern();
		public static final String STAGERANKING = "StageRanking".intern();
		public static final String STATUS = "Status".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class Status
		{
			public static final String FINISHED = "FINISHED".intern();
			public static final String RETIRED = "RETIRED".intern();
		}
	}
	public static class Relations
	{
		public static final String CYCLIST2STAGERANKINGRELATION = "Cyclist2StageRankingRelation".intern();
		public static final String STAGE2STAGERANKINGRELATION = "Stage2StageRankingRelation".intern();
		public static final String STAGERACE2STAGERELATION = "StageRace2StageRelation".intern();
	}
	
	protected GeneratedCyclingraceDaoServiceConstants()
	{
		// private constructor
	}
	
	
}
