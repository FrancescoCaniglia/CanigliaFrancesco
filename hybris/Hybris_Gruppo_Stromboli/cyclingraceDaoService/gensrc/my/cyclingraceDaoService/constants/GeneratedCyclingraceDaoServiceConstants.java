/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-ott-2017 2.33.03                         ---
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
		public static final String MANAGER = "Manager".intern();
		public static final String PERSON = "Person".intern();
		public static final String STAGE = "Stage".intern();
		public static final String STAGERACE = "StageRace".intern();
		public static final String STAGERANKING = "StageRanking".intern();
		public static final String STATUS = "Status".intern();
		public static final String TEAM = "Team".intern();
	}
	public static class Attributes
	{
		public static class Team
		{
			public static final String CODE = "code".intern();
			public static final String CYCLEMODEL = "cycleModel".intern();
			public static final String CYCLISTS = "cyclists".intern();
			public static final String MANAGER = "manager".intern();
			public static final String NAME = "name".intern();
			public static final String NATIONALITY = "nationality".intern();
			public static final String YEAR = "year".intern();
		}
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
		public static final String STAGE2STAGERANKINGRELATION = "Stage2StageRankingRelation".intern();
		public static final String STAGERACE2STAGERELATION = "StageRace2StageRelation".intern();
		public static final String TEAM2CYCLISTRELATION = "Team2CyclistRelation".intern();
	}
	
	protected GeneratedCyclingraceDaoServiceConstants()
	{
		// private constructor
	}
	
	
}
