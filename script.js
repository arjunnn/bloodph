//vars
var pH;
var PaCO2;
var HCO3;
var expectedPaCO2;
var lowerLimitExpectedpH;
var UpperLimitExpectedpH;


//preliminary checks

if (pH > 7.35 && pH < 7.45) {
	if (PaCO2 < 35) {
		//print "Mixed case of Respiratory Alkalosis"
		winterGreen_28_6();
	};
	else if (PaCO2 > 45) {
		//print "Mixed case of Respiratory Acidosis"
		winterGreen_28_5();
		//aniongap();
	};
};
else if (PaCO2 > 35 && PaCO2 < 45) {
	if (pH < 7.35) {
		//print "Combined Metabolic Acidosis and Respiratory Alkalosis"
		winterGreen_28_3();
		//aniongap();
	};
	else if (pH > 7.45) {
		//print "Combined Metabolic Alkalosis and Respiratory Acidosis"
		winterGreen_28_4();
	};
};
else if (pH < 7.35 && PaCO2 > 35) {
	//print "Primary Metabolic Acidosis"
	winterGreen_28_3();
	// aniongap();
};
else if (pH < 7.35 && PaCO2 > 45) {
	//print "Primary Respiratory Acidosis"
	winterGreen_28_5();
	// aniongap();
};
else if (pH > 7.45 && PaCO2 < 35) {
	//print "Primary Respiratory Alkalosis"
	winterGreen_28_6();
};
else if (pH > 7.45 && PaCO2 > 45) {
	//print "Primary metabolic alkalosis"
	winterGreen_28_4(HCO3, PaCO2);
};
else {
	//print "No logical acid base abnormality found"
}



//wintergreen functions

function winterGreen_28_3() {
	expectedPaCO2 = ((1.5 * HCO3) +0 8);
	if (PaCO2 < (expectedPaCO2 - 2)) {
		//print "With superimposed respiratory alkalosis"
	};
	if ((PaCO2 > (expectedPaCO2 + 2) && PaCO2 < 45) {
		//print "Insufficient respiratory compensation"
	};
	if (PaCO2 > 45) {
		//print "With superimposed respiratory acidosis"
	};
	else {
		//print "Sufficient respiratory compensation"
	}
}
function winterGreen_28_4() {
	expectedPaCO2 = ((0.7 * HCO3) + 21);
	if (PaCO2 < (expectedPaCO2 - 2)) {
		// print "With superimposed respiratory alkalosis"
	};
	if (PaCO2 > (expectedPaCO2 + 2)) {
		// print "With superimposed respiratory acidosis"
	};
	else {
		//print "With fully compensated"
	}
}
function winterGreen_28_5() {
	lowerLimitExpectedpH = (7.40 - (0.008 * (PaCO2 - 40)));
	UpperLimitExpectedpH = (7.40 - (0.003 * (PaCO2 - 40)));
	if (pH < lowerLimitExpectedpH) {
		//print "Superimposed meatabolic acidosis and no renal compensation"
	};
	if (pH >= lowerLimitExpectedpH && ph < UpperLimitExpectedpH) {
		//print "Insufficient renal compensation"
	};
	if (pH == UpperLimitExpectedpH) {
		//print "Sufficient renal compensation"
	};
	if (pH > UpperLimitExpectedpH) {
		//print "Superimposed metabolic alkalosis"
	};
}
function winterGreen_28_6() {
	UpperLimitExpectedpH = (7.40 + (0.008 * (40 - PaCO2)));
	UpperLimitExpectedpH = (7.40 - (0.008 * (40 - PaCO2)));
	if (pH < lowerLimitExpectedpH) {
		//print "Superimposed metabolic acidosis and no renal compensation"
	};
	if (pH >= lowerLimitExpectedpH && pH < UpperLimitExpectedpH) {
		//print "Insufficient renal compensation"
	};
	if (pH == UpperLimitExpectedpH) {
		//print "Sufficient renal compensation"
	};
	if (pH > UpperLimitExpectedpH) {
		//print "Respiratory alkalosis"
	};
}