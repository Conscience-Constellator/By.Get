package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long1$1;

public interface Get_Long_By_Long extends
	Get_Q_By_Long,
	Get_Long_By_Q,
	Long1$1
{
	@Lin_Dclar
	long Get_Long_By_Long(long By);
		@Override
		@Nevr_Neds_Ovrid
		default long Long1$1(long In){return Get_Long_By_Long(In);}
}