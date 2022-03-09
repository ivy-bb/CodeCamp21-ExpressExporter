[Ivy]
17F6513AEC6EC9EE 9.3.1 #module
>Proto >Proto Collection #zClass
Gs0 'Get your Goodies' Big #zClass
Gs0 B #cInfo
Gs0 #process
Gs0 @AnnotationInP-0n ai ai #zField
Gs0 @TextInP .type .type #zField
Gs0 @TextInP .processKind .processKind #zField
Gs0 @TextInP .xml .xml #zField
Gs0 @TextInP .responsibility .responsibility #zField
Gs0 @StartRequest f0 '' #zField
Gs0 @UserTask f1 '' #zField
Gs0 @TkArc f2 '' #zField
Gs0 @TaskSwitch f3 '' #zField
Gs0 @TkArc f4 '' #zField
Gs0 @UserTask f5 '' #zField
Gs0 @TkArc f6 '' #zField
Gs0 @TaskSwitch f7 '' #zField
Gs0 @TkArc f8 '' #zField
Gs0 @UserTask f9 '' #zField
Gs0 @TkArc f10 '' #zField
Gs0 @TkArc f11 '' #zField
Gs0 @UserTask f12 '' #zField
Gs0 @TkArc f13 '' #zField
Gs0 @EndTask f14 '' #zField
Gs0 @PushWFArc f15 '' #zField
>Proto Gs0 Gs0 'Get your Goodies' #zField
Gs0 f0 outLink 'start_Get your Goodies.ivp' #txt
Gs0 f0 inParamDecl '<> param;' #txt
Gs0 f0 requestEnabled true #txt
Gs0 f0 triggerEnabled false #txt
Gs0 f0 callSignature start() #txt
Gs0 f0 startName 'Get your Goodies' #txt
Gs0 f0 caseData 'businessCase.attach=true
case.name=Get your Goodies
customFields.STRING.embedInFrame="False"
customFields.STRING.steps="Give your order,Check goods on stock,Final Review"' #txt
Gs0 f0 wfuser 1 #txt
Gs0 f0 roleExceptionId '>> Ignore Exception' #txt
Gs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startGet your Goodies.ivp</name>
        <desc>Get your Goodies</desc>
    </language>
</elementInfo>
' #txt
Gs0 f0 @C|.responsibility Everybody #txt
Gs0 f0 81 113 30 30 -68 17 #rect
Gs0 f1 dialogId axon.ivy.express.sample.Give_your_order #txt
Gs0 f1 startMethod start(axon.ivy.express.sample.Get_your_Goodies_Data) #txt
Gs0 f1 requestActionDecl '<axon.ivy.express.sample.Get_your_Goodies_Data data> param;' #txt
Gs0 f1 requestMappingAction 'param.data=in;
' #txt
Gs0 f1 responseMappingAction 'out=result.data;
' #txt
Gs0 f1 taskData 'TaskA.DESC=Select your goods
TaskA.EXP=new Duration(0,0,1,0,0,0)
TaskA.NAM=Give your order
TaskA.ROL="Everybody"
TaskA.SKIP_TASK_LIST=true
TaskA.TYPE=2
TaskA.customFields.NUMBER.stepindex=0
TaskA.customFields.STRING.dynaform="{''type''\:''USER_TASK'',''responsibles''\:[''Everybody''],''subject''\:''Give your order'',''description''\:''Select your goods'',''taskPosition''\:1,''untilDays''\:1,''formElements''\:[{''elementID''\:''Delivery Address2021-09-15 15\:22\:00'',''label''\:''Delivery Address'',''required''\:false,''intSetting''\:0,''elementType''\:''InputFieldText'',''optionStrs''\:[''''],''elementPosition''\:''HEADER'',''indexInPanel''\:0},{''elementID''\:''Lip Gloss2021-09-15 15\:18\:03'',''label''\:''Lip Gloss'',''required''\:false,''intSetting''\:0,''elementType''\:''ManyCheckbox'',''optionStrs''\:[''color 1'',''color 2'',''color 3''],''elementPosition''\:''LEFTPANEL'',''indexInPanel''\:0},{''elementID''\:''After Shave Balm2021-09-15 15\:19\:50'',''label''\:''After Shave Balm'',''required''\:false,''intSetting''\:0,''elementType''\:''OneRadio'',''optionStrs''\:[''50ml'',''100ml''],''elementPosition''\:''RIGHTPANEL'',''indexInPanel''\:1},{''elementID''\:''Some remarks2021-09-15 15\:20\:21'',''label''\:''Some remarks'',''required''\:false,''intSetting''\:2,''elementType''\:''InputTextArea'',''optionStrs''\:[''''],''elementPosition''\:''FOOTER'',''indexInPanel''\:0}]}"' #txt
Gs0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Give your order</name>
    </language>
</elementInfo>
' #txt
Gs0 f1 168 106 112 44 -41 -8 #rect
Gs0 f2 111 128 168 128 #arcP
Gs0 f3 actionTable 'out=in1;
' #txt
Gs0 f3 outLinks "TaskB.ivp","TaskA.ivp" #txt
Gs0 f3 taskData 'TaskB.NAM=SYSTEM ch.ivyteam.ivy.process.model.diagram.value.Label@986023b2
TaskB.ROL=SYSTEM
TaskB.TYPE=0
TaskA.NAM=SYSTEM ch.ivyteam.ivy.process.model.diagram.value.Label@986023b2
TaskA.ROL=SYSTEM
TaskA.TYPE=0' #txt
Gs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>split</name>
    </language>
</elementInfo>
' #txt
Gs0 f3 336 112 32 32 -11 18 #rect
Gs0 f4 var in1 #txt
Gs0 f4 280 128 336 128 #arcP
Gs0 f5 dialogId axon.ivy.express.sample.Check_goods_on_stock #txt
Gs0 f5 startMethod start(axon.ivy.express.sample.Get_your_Goodies_Data) #txt
Gs0 f5 requestActionDecl '<axon.ivy.express.sample.Get_your_Goodies_Data data> param;' #txt
Gs0 f5 requestMappingAction 'param.data=in;
' #txt
Gs0 f5 responseMappingAction 'out=in;
out.check_goods_on_stock=result.data.check_goods_on_stock;
' #txt
Gs0 f5 taskData 'TaskA.DESC=Check and approve. Set delivery date.
TaskA.EXP=new Duration(0,0,1,0,0,0)
TaskA.NAM=Check goods on stock
TaskA.ROL="\#demo"
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=2
TaskA.customFields.NUMBER.stepindex=1
TaskA.customFields.STRING.dynaform="{''type''\:''USER_TASK'',''responsibles''\:[''\#demo'',''\#admin''],''subject''\:''Check goods on stock'',''description''\:''Check and approve. Set delivery date.'',''taskPosition''\:2,''untilDays''\:1,''formElements''\:[{''elementID''\:''Estimated Delivery\:2021-09-15 15\:22\:38'',''label''\:''Estimated Delivery\:'',''required''\:true,''intSetting''\:0,''elementType''\:''InputFieldText'',''optionStrs''\:[''''],''elementPosition''\:''HEADER'',''indexInPanel''\:0},{''elementID''\:''Footnote\:2021-09-15 15\:23\:01'',''label''\:''Footnote\:'',''required''\:false,''intSetting''\:2,''elementType''\:''InputTextArea'',''optionStrs''\:[''''],''elementPosition''\:''FOOTER'',''indexInPanel''\:0}]}"' #txt
Gs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check goods on stock</name>
    </language>
</elementInfo>
' #txt
Gs0 f5 416 58 128 44 -61 -8 #rect
Gs0 f6 expr data #txt
Gs0 f6 outCond ivp=="TaskA.ivp" #txt
Gs0 f6 364 124 421 102 #arcP
Gs0 f7 actionTable 'out=in1;
' #txt
Gs0 f7 outLinks "TaskA.ivp" #txt
Gs0 f7 taskData 'TaskA.NAM=SYSTEM ch.ivyteam.ivy.process.model.diagram.value.Label@39c94dda
TaskA.ROL=SYSTEM
TaskA.TYPE=0' #txt
Gs0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>join</name>
    </language>
</elementInfo>
' #txt
Gs0 f7 592 112 32 32 -10 18 #rect
Gs0 f8 var in1 #txt
Gs0 f8 539 102 596 124 #arcP
Gs0 f9 dialogId axon.ivy.express.sample.Check_goods_on_stock #txt
Gs0 f9 startMethod start(axon.ivy.express.sample.Get_your_Goodies_Data) #txt
Gs0 f9 requestActionDecl '<axon.ivy.express.sample.Get_your_Goodies_Data data> param;' #txt
Gs0 f9 requestMappingAction 'param.data=in;
' #txt
Gs0 f9 responseMappingAction 'out=in;
out.check_goods_on_stock=result.data.check_goods_on_stock;
' #txt
Gs0 f9 taskData 'TaskA.DESC=Check and approve. Set delivery date.
TaskA.EXP=new Duration(0,0,1,0,0,0)
TaskA.NAM=Check goods on stock
TaskA.ROL="\#admin"
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=2
TaskA.customFields.NUMBER.stepindex=1
TaskA.customFields.STRING.dynaform="{''type''\:''USER_TASK'',''responsibles''\:[''\#demo'',''\#admin''],''subject''\:''Check goods on stock'',''description''\:''Check and approve. Set delivery date.'',''taskPosition''\:2,''untilDays''\:1,''formElements''\:[{''elementID''\:''Estimated Delivery\:2021-09-15 15\:22\:38'',''label''\:''Estimated Delivery\:'',''required''\:true,''intSetting''\:0,''elementType''\:''InputFieldText'',''optionStrs''\:[''''],''elementPosition''\:''HEADER'',''indexInPanel''\:0},{''elementID''\:''Footnote\:2021-09-15 15\:23\:01'',''label''\:''Footnote\:'',''required''\:false,''intSetting''\:2,''elementType''\:''InputTextArea'',''optionStrs''\:[''''],''elementPosition''\:''FOOTER'',''indexInPanel''\:0}]}"' #txt
Gs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check goods on stock</name>
    </language>
</elementInfo>
' #txt
Gs0 f9 416 154 128 44 -61 -8 #rect
Gs0 f10 expr data #txt
Gs0 f10 outCond ivp=="TaskB.ivp" #txt
Gs0 f10 364 132 421 154 #arcP
Gs0 f11 var in2 #txt
Gs0 f11 539 154 596 132 #arcP
Gs0 f12 dialogId axon.ivy.express.sample.Final_review #txt
Gs0 f12 startMethod start(axon.ivy.express.sample.Get_your_Goodies_Data) #txt
Gs0 f12 requestActionDecl '<axon.ivy.express.sample.Get_your_Goodies_Data indata> param;' #txt
Gs0 f12 requestMappingAction 'param.indata=in;
' #txt
Gs0 f12 responseMappingAction 'out=in;
' #txt
Gs0 f12 taskData 'TaskA.NAM=Get your Goodies\: Final Review
TaskA.ROL=CREATOR
TaskA.TYPE=0' #txt
Gs0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Final Review</name>
        <desc>Exported AxonIvyExpress Workflow Get your Goodies</desc>
    </language>
</elementInfo>
' #txt
Gs0 f12 680 106 112 44 -35 -8 #rect
Gs0 f13 expr data #txt
Gs0 f13 outCond ivp=="TaskA.ivp" #txt
Gs0 f13 624 128 680 128 #arcP
Gs0 f14 849 113 30 30 0 15 #rect
Gs0 f15 792 128 849 128 #arcP
>Proto Gs0 .type axon.ivy.express.sample.Get_your_Goodies_Data #txt
>Proto Gs0 .processKind NORMAL #txt
>Proto Gs0 0 0 32 24 18 0 #rect
>Proto Gs0 @|BIcon #fIcon
Gs0 f0 mainOut f2 tail #connect
Gs0 f2 head f1 in #connect
Gs0 f1 out f4 tail #connect
Gs0 f4 head f3 in #connect
Gs0 f3 out f6 tail #connect
Gs0 f6 head f5 in #connect
Gs0 f5 out f8 tail #connect
Gs0 f8 head f7 in #connect
Gs0 f3 out f10 tail #connect
Gs0 f10 head f9 in #connect
Gs0 f9 out f11 tail #connect
Gs0 f11 head f7 in #connect
Gs0 f7 out f13 tail #connect
Gs0 f13 head f12 in #connect
Gs0 f12 out f15 tail #connect
Gs0 f15 head f14 mainIn #connect
