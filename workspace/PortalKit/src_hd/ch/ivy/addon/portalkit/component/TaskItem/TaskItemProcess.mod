[Ivy]
150CB86EFC2F2972 9.3.1 #module
>Proto >Proto Collection #zClass
Ts0 TaskItemProcess Big #zClass
Ts0 RD #cInfo
Ts0 #process
Ts0 @TextInP .type .type #zField
Ts0 @TextInP .processKind .processKind #zField
Ts0 @AnnotationInP-0n ai ai #zField
Ts0 @MessageFlowInP-0n messageIn messageIn #zField
Ts0 @MessageFlowOutP-0n messageOut messageOut #zField
Ts0 @TextInP .xml .xml #zField
Ts0 @TextInP .responsibility .responsibility #zField
Ts0 @UdProcessEnd f46 '' #zField
Ts0 @Alternative f79 '' #zField
Ts0 @PushWFArc f92 '' #zField
Ts0 @UdProcessEnd f98 '' #zField
Ts0 @UdProcessEnd f17 '' #zField
Ts0 @UdMethod f33 '' #zField
Ts0 @UdProcessEnd f1 '' #zField
Ts0 @UdMethod f108 '' #zField
Ts0 @PushWFArc f87 '' #zField
Ts0 @GridStep f80 '' #zField
Ts0 @GridStep f66 '' #zField
Ts0 @Alternative f77 '' #zField
Ts0 @PushWFArc f110 '' #zField
Ts0 @UdProcessEnd f109 '' #zField
Ts0 @PushWFArc f101 '' #zField
Ts0 @PushWFArc f67 '' #zField
Ts0 @PushWFArc f100 '' #zField
Ts0 @Alternative f99 '' #zField
Ts0 @GridStep f49 '' #zField
Ts0 @PushWFArc f81 '' #zField
Ts0 @UdMethod f97 '' #zField
Ts0 @PushWFArc f71 '' #zField
Ts0 @UdProcessEnd f68 '' #zField
Ts0 @PushWFArc f60 '' #zField
Ts0 @PushWFArc f58 '' #zField
Ts0 @GridStep f45 '' #zField
Ts0 @UdInit f0 '' #zField
Ts0 @UdMethod f6 '' #zField
Ts0 @CallSub f7 '' #zField
Ts0 @PushWFArc f9 '' #zField
Ts0 @PushWFArc f2 '' #zField
Ts0 @PushWFArc f11 '' #zField
Ts0 @Alternative f3 '' #zField
Ts0 @PushWFArc f4 '' #zField
Ts0 @CallSub f8 '' #zField
Ts0 @PushWFArc f10 '' #zField
Ts0 @PushWFArc f5 '' #zField
>Proto Ts0 Ts0 TaskItemProcess #zField
Ts0 f46 587 219 26 26 0 12 #rect
Ts0 f79 336 408 32 32 0 16 #rect
Ts0 f92 expr in #txt
Ts0 f92 outCond in.canUserResumeTask #txt
Ts0 f92 368 424 467 424 #arcP
Ts0 f98 467 411 26 26 0 12 #rect
Ts0 f17 -106 1334 20 20 13 0 #rect
Ts0 f33 guid 16816C4D9766CFA8 #txt
Ts0 f33 method openTask(ch.ivyteam.ivy.workflow.ITask,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel) #txt
Ts0 f33 inParameterDecl '<ch.ivyteam.ivy.workflow.ITask task,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel> param;' #txt
Ts0 f33 inParameterMapAction 'out.dataModel=param.dataModel;
out.task=param.task;
' #txt
Ts0 f33 outParameterDecl '<> result;' #txt
Ts0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>openTask(ITask,TaskLazyDataModel)</name>
    </language>
</elementInfo>
' #txt
Ts0 f33 83 219 26 26 -80 15 #rect
Ts0 f1 339 83 26 26 0 12 #rect
Ts0 f108 guid 161932E544273665 #txt
Ts0 f108 method setSelectedTaskAndDataModel(ch.ivyteam.ivy.workflow.ITask,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel) #txt
Ts0 f108 inParameterDecl '<ch.ivyteam.ivy.workflow.ITask task,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel> param;' #txt
Ts0 f108 inParameterMapAction 'out.dataModel=param.dataModel;
out.task=param.task;
' #txt
Ts0 f108 inActionCode 'import ch.ivy.addon.portalkit.jsf.ManagedBeans;
import ch.ivy.addon.portalkit.bean.TaskWidgetBean;

TaskWidgetBean taskWidgetBean = ManagedBeans.get("taskWidgetBean") as TaskWidgetBean;
if (taskWidgetBean != null) {
  taskWidgetBean.setSelectedTaskItemId(param.task.getId());
}' #txt
Ts0 f108 outParameterDecl '<> result;' #txt
Ts0 f108 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setSelectedTaskAndDataModel(ITask,TaskLazyDataModel)</name>
    </language>
</elementInfo>
' #txt
Ts0 f108 83 507 26 26 -85 17 #rect
Ts0 f87 expr out #txt
Ts0 f87 288 424 336 424 #arcP
Ts0 f80 actionTable 'out=in;
' #txt
Ts0 f80 actionCode 'import ch.ivy.addon.portalkit.util.TaskUtils;
import ch.ivy.addon.portalkit.jsf.ManagedBeans;
import ch.ivy.addon.portalkit.bean.TaskActionBean;

TaskActionBean taskActionBean = ManagedBeans.get("taskActionBean") as TaskActionBean;
in.task = TaskUtils.findTaskById(in.task.getId());
out.canUserResumeTask = taskActionBean.canResume(in.task);' #txt
Ts0 f80 security system #txt
Ts0 f80 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check if can resume</name>
    </language>
</elementInfo>
' #txt
Ts0 f80 160 402 128 44 -56 -8 #rect
Ts0 f66 actionTable 'out=in;
' #txt
Ts0 f66 actionCode 'import org.primefaces.PrimeFaces;
import ch.ivyteam.ivy.security.IUser;
import org.apache.commons.lang3.StringUtils;
import ch.ivyteam.ivy.workflow.TaskState;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

FacesContext facesContext = FacesContext.getCurrentInstance();

String notification;
if(in.task.getState() == TaskState.DONE){
	notification = ivy.cms.co("/ch.ivy.addon.portalkit.ui.jsf/components/taskStart/cannotStartMessages/taskDone", [in.task.getName()]);
} else {
	IUser worker = in.task.getWorkerUser();
	if (worker != null){
		String fullName = worker.getFullName();
		String workerName = StringUtils.isBlank(fullName) ? worker.getName() : worker.getFullName() + " (" + worker.getName() + ")";
		notification = ivy.cms.co("/ch.ivy.addon.portalkit.ui.jsf/components/taskStart/cannotStartMessages/isAnotherUserWorking", [in.task.name, in.task.getId(), workerName]);
	} else {
		notification = ivy.cms.co("/ch.ivy.addon.portalkit.ui.jsf/components/taskStart/cannotStartMessages/noPermission", [in.task.getName()]);
	}
}

facesContext.validationFailed();
facesContext.addMessage("portal-global-growl-message", new FacesMessage(FacesMessage.SEVERITY_INFO, notification, null));
PrimeFaces.current().ajax().update("portal-global-growl");  
' #txt
Ts0 f66 security system #txt
Ts0 f66 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Display error</name>
    </language>
</elementInfo>
' #txt
Ts0 f66 424 306 112 44 -35 -8 #rect
Ts0 f77 338 218 28 28 14 0 #rect
Ts0 f110 expr out #txt
Ts0 f110 109 520 339 520 #arcP
Ts0 f110 0 0.49999999999999994 0 0 #arcLabel
Ts0 f109 339 507 26 26 0 12 #rect
Ts0 f101 expr in #txt
Ts0 f101 352 408 352 344 #arcP
Ts0 f67 expr in #txt
Ts0 f67 368 328 424 328 #arcP
Ts0 f67 0 0.1527488616366867 0 0 #arcLabel
Ts0 f100 expr in #txt
Ts0 f100 352 246 352 312 #arcP
Ts0 f100 0 0.6038825846613081 0 0 #arcLabel
Ts0 f99 336 312 32 32 0 16 #rect
Ts0 f49 actionTable 'out=in;
' #txt
Ts0 f49 actionCode 'import ch.ivy.addon.portalkit.util.RequestUtil;
import ch.ivy.addon.portalkit.enums.PortalPage;
import ch.ivy.addon.portalkit.enums.NavigationHistory;
import ch.ivy.addon.portalkit.dto.TaskEndInfo;
import ch.ivy.addon.portalkit.service.StickyTaskListService;
import ch.ivy.addon.portalkit.util.SecurityServiceUtils;
import javax.faces.context.FacesContext;

TaskEndInfo taskEndInfo = new TaskEndInfo();
taskEndInfo.setDataModel(in.dataModel);
taskEndInfo.setPortalPage(PortalPage.valueOf(in.currentPortalPage));

String taskEndInfoSessionAttributeKey = StickyTaskListService.service().getTaskEndInfoSessionAttributeKey(in.task.getId());
SecurityServiceUtils.setSessionAttribute(taskEndInfoSessionAttributeKey, taskEndInfo);

// Put the "embedInIFrame" param to the task start link to open it in the DefaultFramePage process
// Then this process will open task in IFrame or not based on its "embedInIFrame" String custom field
RequestUtil.redirect(in.task.getStartLinkEmbedded().getRelative());' #txt
Ts0 f49 security system #txt
Ts0 f49 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Store task end info&#13;
Start task</name>
    </language>
</elementInfo>
' #txt
Ts0 f49 416 210 128 44 -44 -16 #rect
Ts0 f81 expr out #txt
Ts0 f81 109 424 160 424 #arcP
Ts0 f97 guid 1602EFA80B079E1D #txt
Ts0 f97 method validate(ch.ivyteam.ivy.workflow.ITask,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel) #txt
Ts0 f97 inParameterDecl '<ch.ivyteam.ivy.workflow.ITask task,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel> param;' #txt
Ts0 f97 inParameterMapAction 'out.dataModel=param.dataModel;
out.task=param.task;
' #txt
Ts0 f97 outParameterDecl '<> result;' #txt
Ts0 f97 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate(ITask,TaskLazyDataModel)</name>
    </language>
</elementInfo>
' #txt
Ts0 f97 83 411 26 26 -60 16 #rect
Ts0 f71 expr out #txt
Ts0 f71 536 328 595 328 #arcP
Ts0 f68 595 315 26 26 0 12 #rect
Ts0 f60 expr out #txt
Ts0 f60 288 232 338 232 #arcP
Ts0 f58 expr out #txt
Ts0 f58 109 232 160 232 #arcP
Ts0 f45 actionTable 'out=in;
' #txt
Ts0 f45 actionCode 'import ch.ivy.addon.portalkit.util.TaskUtils;
import ch.ivy.addon.portalkit.jsf.ManagedBeans;
import ch.ivy.addon.portalkit.bean.TaskActionBean;

TaskActionBean taskActionBean = ManagedBeans.get("taskActionBean") as TaskActionBean;
in.task = TaskUtils.findTaskById(in.task.getId());
out.canUserResumeTask = taskActionBean.canResume(in.task);' #txt
Ts0 f45 security system #txt
Ts0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check if can resume</name>
    </language>
</elementInfo>
' #txt
Ts0 f45 160 210 128 44 -56 -8 #rect
Ts0 f0 guid 16816B3D5FE7A2CB #txt
Ts0 f0 method start(String) #txt
Ts0 f0 inParameterDecl '<String currentPortalPage> param;' #txt
Ts0 f0 inParameterMapAction 'out.currentPortalPage=param.currentPortalPage;
' #txt
Ts0 f0 outParameterDecl '<> result;' #txt
Ts0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String)</name>
    </language>
</elementInfo>
' #txt
Ts0 f0 83 83 26 26 -16 15 #rect
Ts0 f6 guid 16D28868336F21A0 #txt
Ts0 f6 method openDetails(ch.ivyteam.ivy.workflow.ITask,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel,Boolean) #txt
Ts0 f6 inParameterDecl '<ch.ivyteam.ivy.workflow.ITask task,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel,Boolean inFrame> param;' #txt
Ts0 f6 inParameterMapAction 'out.dataModel=param.dataModel;
out.inFrame=param.inFrame;
out.task=param.task;
' #txt
Ts0 f6 outParameterDecl '<> result;' #txt
Ts0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>openDetails(ITask,TaskLazyDataModel,Boolean)</name>
    </language>
</elementInfo>
' #txt
Ts0 f6 83 627 26 26 -70 15 #rect
Ts0 f7 processCall 'Functional Processes/OpenPortalTaskDetailsHook:callInFrame(ch.ivyteam.ivy.workflow.ITask,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel,ch.ivy.addon.portalkit.enums.PortalPage,Boolean)' #txt
Ts0 f7 requestActionDecl '<ch.ivyteam.ivy.workflow.ITask task,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel,ch.ivy.addon.portalkit.enums.PortalPage portalPage,Boolean isFromTaskList> param;' #txt
Ts0 f7 requestMappingAction 'param.task=in.task;
param.dataModel=in.dataModel;
param.portalPage=ch.ivy.addon.portalkit.enums.PortalPage.valueOf(in.currentPortalPage);
param.isFromTaskList=true;
' #txt
Ts0 f7 responseActionDecl 'ch.ivy.addon.portalkit.component.TaskItem.TaskItemData out;
' #txt
Ts0 f7 responseMappingAction 'out=in;
' #txt
Ts0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>OpenPortalTaskDetails</name>
    </language>
</elementInfo>
' #txt
Ts0 f7 416 618 144 44 -64 -8 #rect
Ts0 f9 544 232 587 232 #arcP
Ts0 f2 109 96 339 96 #arcP
Ts0 f11 expr in #txt
Ts0 f11 outCond in.canUserResumeTask #txt
Ts0 f11 366 232 416 232 #arcP
Ts0 f3 272 624 32 32 0 16 #rect
Ts0 f4 expr out #txt
Ts0 f4 109 640 272 640 #arcP
Ts0 f8 processCall 'Functional Processes/OpenPortalTaskDetailsHook:call(ch.ivyteam.ivy.workflow.ITask,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel,ch.ivy.addon.portalkit.enums.PortalPage,Boolean)' #txt
Ts0 f8 requestActionDecl '<ch.ivyteam.ivy.workflow.ITask task,ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel,ch.ivy.addon.portalkit.enums.PortalPage portalPage,Boolean isFromTaskList> param;' #txt
Ts0 f8 requestMappingAction 'param.task=in.task;
param.dataModel=in.dataModel;
param.portalPage=ch.ivy.addon.portalkit.enums.PortalPage.valueOf(in.currentPortalPage);
param.isFromTaskList=true;
' #txt
Ts0 f8 responseActionDecl 'ch.ivy.addon.portalkit.component.TaskItem.TaskItemData out;
' #txt
Ts0 f8 responseMappingAction 'out=in;
' #txt
Ts0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>OpenPortalTaskDetails</name>
    </language>
</elementInfo>
' #txt
Ts0 f8 416 730 144 44 -64 -8 #rect
Ts0 f10 expr in #txt
Ts0 f10 outCond !in.inFrame #txt
Ts0 f10 288 656 416 752 #arcP
Ts0 f10 1 288 752 #addKink
Ts0 f10 1 0.1737415691246871 0 0 #arcLabel
Ts0 f5 expr in #txt
Ts0 f5 304 640 416 640 #arcP
>Proto Ts0 .type ch.ivy.addon.portalkit.component.TaskItem.TaskItemData #txt
>Proto Ts0 .processKind HTML_DIALOG #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
Ts0 f108 mainOut f110 tail #connect
Ts0 f110 head f109 mainIn #connect
Ts0 f33 mainOut f58 tail #connect
Ts0 f58 head f45 mainIn #connect
Ts0 f45 mainOut f60 tail #connect
Ts0 f60 head f77 in #connect
Ts0 f66 mainOut f71 tail #connect
Ts0 f71 head f68 mainIn #connect
Ts0 f97 mainOut f81 tail #connect
Ts0 f81 head f80 mainIn #connect
Ts0 f80 mainOut f87 tail #connect
Ts0 f87 head f79 in #connect
Ts0 f79 out f92 tail #connect
Ts0 f92 head f98 mainIn #connect
Ts0 f100 head f99 in #connect
Ts0 f99 out f67 tail #connect
Ts0 f67 head f66 mainIn #connect
Ts0 f79 out f101 tail #connect
Ts0 f101 head f99 in #connect
Ts0 f49 mainOut f9 tail #connect
Ts0 f9 head f46 mainIn #connect
Ts0 f0 mainOut f2 tail #connect
Ts0 f2 head f1 mainIn #connect
Ts0 f77 out f11 tail #connect
Ts0 f11 head f49 mainIn #connect
Ts0 f77 out f100 tail #connect
Ts0 f6 mainOut f4 tail #connect
Ts0 f4 head f3 in #connect
Ts0 f3 out f10 tail #connect
Ts0 f10 head f8 mainIn #connect
Ts0 f3 out f5 tail #connect
Ts0 f5 head f7 mainIn #connect
