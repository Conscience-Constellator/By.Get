package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Short;

public interface Get_Short_By_Byt extends
	Get_Q_By_Byt,
	Get_Short_By_Q,
	Byt$Short
{
	@Lin_Dclar
	short Get_Short_By_Byt(byte By);
		@Override
		@Nevr_Neds_Ovrid
		default short Byt$Short(byte In){return Get_Short_By_Byt(In);}
}